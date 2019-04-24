.class Lo/dhq$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dhq;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dhq;


# direct methods
.method constructor <init>(Lo/dhq;)V
    .locals 0

    .line 611
    iput-object p1, p0, Lo/dhq$4;->c:Lo/dhq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 616
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x6

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLocationsCallbackMapList.size() is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dhq$4;->c:Lo/dhq;

    invoke-static {v2}, Lo/dhq;->p(Lo/dhq;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", mGpsStatusCallbackMapList.size() is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dhq$4;->c:Lo/dhq;

    .line 617
    invoke-static {v2}, Lo/dhq;->l(Lo/dhq;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", IOriginalGpsStatusListenerMapList.size() is  "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dhq$4;->c:Lo/dhq;

    .line 618
    invoke-static {v2}, Lo/dhq;->o(Lo/dhq;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 616
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    iget-object v0, p0, Lo/dhq$4;->c:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->p(Lo/dhq;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 620
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 621
    iget-object v0, p0, Lo/dhq$4;->c:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->p(Lo/dhq;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    new-instance v1, Lo/dhq$4$3;

    invoke-direct {v1, p0}, Lo/dhq$4$3;-><init>(Lo/dhq$4;)V

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->forEach(JLjava/util/function/BiConsumer;)V

    .line 635
    :cond_0
    iget-object v0, p0, Lo/dhq$4;->c:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->l(Lo/dhq;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 636
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    .line 637
    iget-object v0, p0, Lo/dhq$4;->c:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->l(Lo/dhq;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    new-instance v1, Lo/dhq$4$2;

    invoke-direct {v1, p0}, Lo/dhq$4$2;-><init>(Lo/dhq$4;)V

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->forEach(JLjava/util/function/BiConsumer;)V

    .line 650
    :cond_1
    iget-object v0, p0, Lo/dhq$4;->c:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->o(Lo/dhq;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 651
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_2

    .line 652
    iget-object v0, p0, Lo/dhq$4;->c:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->o(Lo/dhq;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    new-instance v1, Lo/dhq$4$5;

    invoke-direct {v1, p0}, Lo/dhq$4$5;-><init>(Lo/dhq$4;)V

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->forEach(JLjava/util/function/BiConsumer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 667
    :cond_2
    goto :goto_0

    .line 665
    :catch_0
    move-exception v4

    .line 666
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startPrintKeyName  e is  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 668
    :goto_0
    iget-object v0, p0, Lo/dhq$4;->c:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->n(Lo/dhq;)Lo/dhq$e;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 669
    iget-object v0, p0, Lo/dhq$4;->c:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->n(Lo/dhq;)Lo/dhq$e;

    move-result-object v0

    const-wide/32 v1, 0x1b7740

    invoke-virtual {v0, p0, v1, v2}, Lo/dhq$e;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 671
    :cond_3
    return-void
.end method
