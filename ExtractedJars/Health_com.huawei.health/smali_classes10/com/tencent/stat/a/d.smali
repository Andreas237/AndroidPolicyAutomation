.class public Lcom/tencent/stat/a/d;
.super Lcom/tencent/stat/a/e;


# instance fields
.field private a:Ljava/lang/String;

.field private l:I

.field private m:I


# direct methods
.method public constructor <init>(Landroid/content/Context;IILjava/lang/Throwable;)V
    .locals 6

    invoke-direct {p0, p1, p2}, Lcom/tencent/stat/a/e;-><init>(Landroid/content/Context;I)V

    const/16 v0, 0x64

    iput v0, p0, Lcom/tencent/stat/a/d;->m:I

    if-eqz p4, :cond_2

    new-instance v2, Ljava/lang/Throwable;

    invoke-direct {v2, p4}, Ljava/lang/Throwable;-><init>(Ljava/lang/Throwable;)V

    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v3

    if-eqz v3, :cond_1

    array-length v0, v3

    iget v1, p0, Lcom/tencent/stat/a/d;->m:I

    if-le v0, v1, :cond_1

    iget v0, p0, Lcom/tencent/stat/a/d;->m:I

    new-array v4, v0, [Ljava/lang/StackTraceElement;

    const/4 v5, 0x0

    :goto_0
    iget v0, p0, Lcom/tencent/stat/a/d;->m:I

    if-ge v5, v0, :cond_0

    aget-object v0, v3, v5

    aput-object v0, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v4}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    goto :goto_1

    :catch_0
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    new-instance v3, Ljava/io/StringWriter;

    invoke-direct {v3}, Ljava/io/StringWriter;-><init>()V

    new-instance v4, Ljava/io/PrintWriter;

    invoke-direct {v4, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v2, v4}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    invoke-virtual {v3}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/stat/a/d;->a:Ljava/lang/String;

    iput p3, p0, Lcom/tencent/stat/a/d;->l:I

    invoke-virtual {v4}, Ljava/io/PrintWriter;->close()V

    :cond_2
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;II)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lcom/tencent/stat/a/e;-><init>(Landroid/content/Context;I)V

    const/16 v0, 0x64

    iput v0, p0, Lcom/tencent/stat/a/d;->m:I

    if-eqz p3, :cond_2

    move v1, p5

    if-gtz v1, :cond_0

    invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxReportEventLength()I

    move-result v1

    :cond_0
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v0, v1, :cond_1

    iput-object p3, p0, Lcom/tencent/stat/a/d;->a:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/stat/a/d;->a:Ljava/lang/String;

    :cond_2
    :goto_0
    iput p4, p0, Lcom/tencent/stat/a/d;->l:I

    return-void
.end method


# virtual methods
.method public a()Lcom/tencent/stat/a/f;
    .locals 1

    sget-object v0, Lcom/tencent/stat/a/f;->c:Lcom/tencent/stat/a/f;

    return-object v0
.end method

.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/tencent/stat/a/d;->c:J

    return-void
.end method

.method public a(Lorg/json/JSONObject;)Z
    .locals 2

    const-string v0, "er"

    iget-object v1, p0, Lcom/tencent/stat/a/d;->a:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ea"

    iget v1, p0, Lcom/tencent/stat/a/d;->l:I

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const/4 v0, 0x1

    return v0
.end method
