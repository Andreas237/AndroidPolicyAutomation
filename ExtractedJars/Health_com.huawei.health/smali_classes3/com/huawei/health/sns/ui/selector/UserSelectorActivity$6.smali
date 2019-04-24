.class Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bjw;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->a(JLjava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic c:I

.field final synthetic d:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;JI)V
    .locals 0

    .line 913
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$6;->d:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iput-wide p2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$6;->a:J

    iput p4, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$6;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 923
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$6;->d:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)V

    .line 924
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .line 917
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$6;->d:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$6;->a:J

    iget v3, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$6;->c:I

    invoke-static {v0, v1, v2, v3, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;JILjava/lang/String;)V

    .line 918
    return-void
.end method
