.class Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)V
    .locals 0

    .line 301
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$4;->b:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$4;->b:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->a(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_0

    .line 306
    return-void

    .line 308
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$4;->b:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Z)Z

    .line 309
    return-void
.end method
