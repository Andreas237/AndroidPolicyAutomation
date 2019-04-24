.class public abstract Lo/bpu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bqb;


# static fields
.field private static final CONN_TIMEOUT:I = 0x2710

.field private static final READ_TIMEOUT:I = 0x2710


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static get(Ljava/lang/String;)Lo/bpu;
    .locals 2

    .line 74
    if-nez p0, :cond_0

    .line 76
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "url is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 79
    :cond_0
    new-instance v0, Lo/bpu$5;

    invoke-direct {v0, p0}, Lo/bpu$5;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static get(Ljava/lang/String;Ljava/lang/String;)Lo/bpu;
    .locals 2

    .line 97
    if-nez p0, :cond_0

    .line 99
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "url is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 102
    :cond_0
    new-instance v0, Lo/bpu$1;

    invoke-direct {v0, p0, p1}, Lo/bpu$1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public getConnTimeout()I
    .locals 1

    .line 45
    const/16 v0, 0x2710

    return v0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    .line 18
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCookie()Ljava/lang/String;
    .locals 1

    .line 63
    const/4 v0, 0x0

    return-object v0
.end method

.method public getFileKey()Ljava/lang/String;
    .locals 1

    .line 30
    const/4 v0, 0x0

    return-object v0
.end method

.method public getFilePath()Ljava/lang/String;
    .locals 1

    .line 24
    const/4 v0, 0x0

    return-object v0
.end method

.method public getFormParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 36
    const/4 v0, 0x0

    return-object v0
.end method

.method public getReadTimeout()I
    .locals 1

    .line 51
    const/16 v0, 0x2710

    return v0
.end method

.method public abstract getRequestUrl()Ljava/lang/String;
.end method

.method public isRetryRequest()Z
    .locals 1

    .line 58
    const/4 v0, 0x1

    return v0
.end method
