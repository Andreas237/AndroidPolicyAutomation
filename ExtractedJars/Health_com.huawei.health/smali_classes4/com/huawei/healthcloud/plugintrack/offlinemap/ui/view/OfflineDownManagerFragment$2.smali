.class Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cfy$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/support/v4/app/FragmentActivity;

.field final synthetic c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;Landroid/support/v4/app/FragmentActivity;Ljava/lang/String;)V
    .locals 0

    .line 285
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$2;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    iput-object p2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$2;->b:Landroid/support/v4/app/FragmentActivity;

    iput-object p3, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$2;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/cfy$a;Ljava/lang/Object;)V
    .locals 3

    .line 290
    sget-object v0, Lo/cfy$a;->b:Lo/cfy$a;

    if-ne p1, v0, :cond_0

    .line 292
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$2;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v0}, Lo/cgd;->b(Landroid/content/Context;)Lo/cgd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$2;->e:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/cgd;->d(Ljava/lang/String;Z)V

    .line 294
    :cond_0
    return-void
.end method
