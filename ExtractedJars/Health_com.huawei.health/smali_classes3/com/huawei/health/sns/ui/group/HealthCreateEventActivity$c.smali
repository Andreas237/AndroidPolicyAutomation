.class Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V
    .locals 0

    .line 309
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$c;->a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$5;)V
    .locals 0

    .line 309
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$c;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .line 322
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAllEdit:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$c;->a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->e(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$c;->a:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->g(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V

    .line 324
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 313
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 318
    return-void
.end method
