package org.example.bankaccountservice.exeptions;

import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.schema.DataFetchingEnvironment;
import org.aspectj.lang.reflect.SourceLocation;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomDataFetcherExceptionResolver extends DataFetcherExceptionResolverAdapter {

    @Override
    protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
        return new GraphQLError(){

            @Override
            public String getMessage() {
                 return ex.getMessage();
            }

            @Override
            public List<graphql.language.SourceLocation> getLocations() {
                return null;
            }

            @Override
            public ErrorClassification getErrorType(){
                return null;
            }
        };
    }
}
