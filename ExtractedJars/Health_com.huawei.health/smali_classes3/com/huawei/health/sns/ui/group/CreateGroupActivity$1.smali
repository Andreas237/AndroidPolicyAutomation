.class Lcom/huawei/health/sns/ui/group/CreateGroupActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/CreateGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;)V
    .locals 0

    .line 273
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity$1;->b:Lcom/huawei/health/sns/ui/group/CreateGroupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 277
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity$1;->b:Lcom/huawei/health/sns/ui/group/CreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->b(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;)V

    .line 279
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity$1;->b:Lcom/huawei/health/sns/ui/group/CreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->c(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 281
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity$1;->b:Lcom/huawei/health/sns/ui/group/CreateGroupActivity;

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    iget-object v4, p0, Lcom/huawei/health/sns/ui/group/CreateGroupActivity$1;->b:Lcom/huawei/health/sns/ui/group/CreateGroupActivity;

    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/CreateGroupActivity;->c(Lcom/huawei/health/sns/ui/group/CreateGroupActivity;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/aow;->a(Landroid/content/Context;JLjava/lang/String;)V

    .line 283
    :cond_0
    return-void
.end method
