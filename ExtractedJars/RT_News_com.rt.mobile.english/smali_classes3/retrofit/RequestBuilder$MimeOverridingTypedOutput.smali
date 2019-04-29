.class Lretrofit/RequestBuilder$MimeOverridingTypedOutput;
.super Ljava/lang/Object;
.source "RequestBuilder.java"

# interfaces
.implements Lretrofit/mime/TypedOutput;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/RequestBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "MimeOverridingTypedOutput"
.end annotation


# instance fields
.field private final delegate:Lretrofit/mime/TypedOutput;

.field private final mimeType:Ljava/lang/String;


# direct methods
.method constructor <init>(Lretrofit/mime/TypedOutput;Ljava/lang/String;)V
    .locals 0

    .line 425
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 426
    iput-object p1, p0, Lretrofit/RequestBuilder$MimeOverridingTypedOutput;->delegate:Lretrofit/mime/TypedOutput;

    .line 427
    iput-object p2, p0, Lretrofit/RequestBuilder$MimeOverridingTypedOutput;->mimeType:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public fileName()Ljava/lang/String;
    .locals 1

    .line 431
    iget-object v0, p0, Lretrofit/RequestBuilder$MimeOverridingTypedOutput;->delegate:Lretrofit/mime/TypedOutput;

    invoke-interface {v0}, Lretrofit/mime/TypedOutput;->fileName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public length()J
    .locals 2

    .line 439
    iget-object v0, p0, Lretrofit/RequestBuilder$MimeOverridingTypedOutput;->delegate:Lretrofit/mime/TypedOutput;

    invoke-interface {v0}, Lretrofit/mime/TypedOutput;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public mimeType()Ljava/lang/String;
    .locals 1

    .line 435
    iget-object v0, p0, Lretrofit/RequestBuilder$MimeOverridingTypedOutput;->mimeType:Ljava/lang/String;

    return-object v0
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 443
    iget-object v0, p0, Lretrofit/RequestBuilder$MimeOverridingTypedOutput;->delegate:Lretrofit/mime/TypedOutput;

    invoke-interface {v0, p1}, Lretrofit/mime/TypedOutput;->writeTo(Ljava/io/OutputStream;)V

    return-void
.end method
