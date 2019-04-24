.class public Lcom/myfitnesspal/shared/utils/Ln$Print;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/myfitnesspal/shared/utils/Ln;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Print"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 222
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static getScope()Ljava/lang/String;
    .locals 3

    .line 234
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    .line 235
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    const/4 v1, 0x5

    aget-object v2, v0, v1

    .line 236
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget-object v1, v1, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->scope:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 239
    :cond_0
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget-object v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->scope:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public println(ILjava/lang/String;)I
    .locals 2

    .line 224
    invoke-static {}, Lcom/myfitnesspal/shared/utils/Ln$Print;->getScope()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p2}, Lcom/myfitnesspal/shared/utils/Ln$Print;->processMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method protected processMessage(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 228
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    .line 229
    const-string v0, "%s %s %s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MFP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 230
    :cond_0
    return-object p1
.end method
