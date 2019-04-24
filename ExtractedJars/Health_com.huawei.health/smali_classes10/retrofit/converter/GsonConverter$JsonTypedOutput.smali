.class Lretrofit/converter/GsonConverter$JsonTypedOutput;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit/mime/TypedOutput;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/converter/GsonConverter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "JsonTypedOutput"
.end annotation


# instance fields
.field private final jsonBytes:[B

.field private final mimeType:Ljava/lang/String;


# direct methods
.method constructor <init>([BLjava/lang/String;)V
    .locals 2

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p1, p0, Lretrofit/converter/GsonConverter$JsonTypedOutput;->jsonBytes:[B

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "application/json; charset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lretrofit/converter/GsonConverter$JsonTypedOutput;->mimeType:Ljava/lang/String;

    .line 93
    return-void
.end method


# virtual methods
.method public fileName()Ljava/lang/String;
    .locals 1

    .line 96
    const/4 v0, 0x0

    return-object v0
.end method

.method public length()J
    .locals 2

    .line 104
    iget-object v0, p0, Lretrofit/converter/GsonConverter$JsonTypedOutput;->jsonBytes:[B

    array-length v0, v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public mimeType()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lretrofit/converter/GsonConverter$JsonTypedOutput;->mimeType:Ljava/lang/String;

    return-object v0
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 108
    iget-object v0, p0, Lretrofit/converter/GsonConverter$JsonTypedOutput;->jsonBytes:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 109
    return-void
.end method
