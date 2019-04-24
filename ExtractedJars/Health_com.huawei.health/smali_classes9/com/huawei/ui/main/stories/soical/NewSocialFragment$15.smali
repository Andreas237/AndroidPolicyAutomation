.class Lcom/huawei/ui/main/stories/soical/NewSocialFragment$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 1170
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$15;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1173
    invoke-static {}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 1174
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$15;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->z(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1175
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 1176
    :goto_0
    return-void
.end method
