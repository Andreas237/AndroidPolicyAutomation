.class public Lcom/usebutton/sdk/internal/util/TestUtils;
.super Ljava/lang/Object;
.source "TestUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isNotTesting()Z
    .locals 1

    .line 13
    invoke-static {}, Lcom/usebutton/sdk/internal/util/TestUtils;->isTesting()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static isTesting()Z
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.usebutton.test.MockedTest"

    .line 6
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    :catch_0
    return v0
.end method
