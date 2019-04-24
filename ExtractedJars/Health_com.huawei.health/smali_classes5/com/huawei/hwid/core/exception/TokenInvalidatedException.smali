.class public Lcom/huawei/hwid/core/exception/TokenInvalidatedException;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 19
    iput-object p1, p0, Lcom/huawei/hwid/core/exception/TokenInvalidatedException;->a:Ljava/lang/String;

    .line 20
    return-void
.end method


# virtual methods
.method public getErrorDesc()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/hwid/core/exception/TokenInvalidatedException;->a:Ljava/lang/String;

    return-object v0
.end method

.method public setErrorDesc(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/hwid/core/exception/TokenInvalidatedException;->a:Ljava/lang/String;

    .line 28
    return-void
.end method
