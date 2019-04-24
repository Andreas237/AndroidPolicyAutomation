.class Lcom/tencent/stat/v;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/tencent/stat/n;


# direct methods
.method constructor <init>(Lcom/tencent/stat/n;I)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/stat/v;->b:Lcom/tencent/stat/n;

    iput p2, p0, Lcom/tencent/stat/v;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    invoke-static {}, Lcom/tencent/stat/StatConfig;->a()I

    move-result v2

    iget v0, p0, Lcom/tencent/stat/v;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/tencent/stat/v;->b:Lcom/tencent/stat/n;

    iget v3, v0, Lcom/tencent/stat/n;->b:I

    goto :goto_0

    :cond_0
    iget v3, p0, Lcom/tencent/stat/v;->a:I

    :goto_0
    div-int v4, v3, v2

    rem-int v5, v3, v2

    const/4 v6, 0x0

    :goto_1
    add-int/lit8 v0, v4, 0x1

    if-ge v6, v0, :cond_1

    iget-object v0, p0, Lcom/tencent/stat/v;->b:Lcom/tencent/stat/n;

    invoke-static {v0, v2}, Lcom/tencent/stat/n;->a(Lcom/tencent/stat/n;I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    if-lez v5, :cond_2

    iget-object v0, p0, Lcom/tencent/stat/v;->b:Lcom/tencent/stat/n;

    invoke-static {v0, v5}, Lcom/tencent/stat/n;->a(Lcom/tencent/stat/n;I)V

    :cond_2
    return-void
.end method
