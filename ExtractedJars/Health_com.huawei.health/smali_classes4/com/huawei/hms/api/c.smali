.class Lcom/huawei/hms/api/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Lcom/huawei/hms/api/c;


# instance fields
.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/app/Activity;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Lcom/huawei/hms/api/c;

    invoke-direct {v0}, Lcom/huawei/hms/api/c;-><init>()V

    sput-object v0, Lcom/huawei/hms/api/c;->a:Lcom/huawei/hms/api/c;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/hms/api/c;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method a(Landroid/app/Activity;)V
    .locals 3

    .line 21
    iget-object v0, p0, Lcom/huawei/hms/api/c;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/Activity;

    .line 22
    if-eqz v2, :cond_0

    if-eq v2, p1, :cond_0

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 23
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 25
    :cond_0
    goto :goto_0

    .line 27
    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/api/c;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    return-void
.end method

.method b(Landroid/app/Activity;)V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/hms/api/c;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 36
    return-void
.end method
