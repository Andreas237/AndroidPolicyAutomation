.class public interface abstract Lretrofit/converter/Converter;
.super Ljava/lang/Object;
.source "Converter.java"


# virtual methods
.method public abstract fromBody(Lretrofit/mime/TypedInput;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lretrofit/converter/ConversionException;
        }
    .end annotation
.end method

.method public abstract toBody(Ljava/lang/Object;)Lretrofit/mime/TypedOutput;
.end method
