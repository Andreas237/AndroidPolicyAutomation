.class Lcom/huawei/openalliance/ad/k/d$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;ZLcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/huawei/openalliance/ad/k/d$a;

.field final synthetic d:Z

.field final synthetic e:Lcom/huawei/openalliance/ad/download/app/c;

.field final synthetic f:Lcom/huawei/openalliance/ad/k/d;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/k/d;Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;Lcom/huawei/openalliance/ad/k/d$a;ZLcom/huawei/openalliance/ad/download/app/c;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/k/d$1;->f:Lcom/huawei/openalliance/ad/k/d;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/k/d$1;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    iput-object p3, p0, Lcom/huawei/openalliance/ad/k/d$1;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/openalliance/ad/k/d$1;->c:Lcom/huawei/openalliance/ad/k/d$a;

    iput-boolean p5, p0, Lcom/huawei/openalliance/ad/k/d$1;->d:Z

    iput-object p6, p0, Lcom/huawei/openalliance/ad/k/d$1;->e:Lcom/huawei/openalliance/ad/download/app/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->f:Lcom/huawei/openalliance/ad/k/d;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/d$1;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/k/d$1;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/k/d$1;->c:Lcom/huawei/openalliance/ad/k/d$a;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/k/d;Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;Lcom/huawei/openalliance/ad/k/d$a;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->d:Z

    if-eqz v0, :cond_2

    const-string v0, "3"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/d$1;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPriorInstallWay()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->e:Lcom/huawei/openalliance/ad/download/app/c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->e:Lcom/huawei/openalliance/ad/download/app/c;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/c;->c(I)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->f:Lcom/huawei/openalliance/ad/k/d;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/d$1;->e:Lcom/huawei/openalliance/ad/download/app/c;

    sget-object v2, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALLSTART:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v3, 0x3

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/k/d;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/constant/EventType;I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->f:Lcom/huawei/openalliance/ad/k/d;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/k/d;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/d$1;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/k/d$1;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/openalliance/ad/k/d$1;->c:Lcom/huawei/openalliance/ad/k/d$a;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/utils/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/openalliance/ad/k/d$a;)V

    goto/16 :goto_1

    :cond_2
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->d:Z

    if-eqz v0, :cond_6

    const-string v0, "1"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/d$1;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPriorInstallWay()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->e:Lcom/huawei/openalliance/ad/download/app/c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->e:Lcom/huawei/openalliance/ad/download/app/c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/c;->c(I)V

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->f:Lcom/huawei/openalliance/ad/k/d;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/k/d;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/d$1;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/k/d$1;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/c;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->c:Lcom/huawei/openalliance/ad/k/d$a;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->c:Lcom/huawei/openalliance/ad/k/d$a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/k/d$a;->a()V

    :cond_4
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->f:Lcom/huawei/openalliance/ad/k/d;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/d$1;->e:Lcom/huawei/openalliance/ad/download/app/c;

    sget-object v2, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALLSTART:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/k/d;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/constant/EventType;I)V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->f:Lcom/huawei/openalliance/ad/k/d;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/d$1;->e:Lcom/huawei/openalliance/ad/download/app/c;

    sget-object v2, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALLFAIL:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/k/d;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/constant/EventType;I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->f:Lcom/huawei/openalliance/ad/k/d;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/d$1;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/k/d$1;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/k/d$1;->e:Lcom/huawei/openalliance/ad/download/app/c;

    iget-object v4, p0, Lcom/huawei/openalliance/ad/k/d$1;->c:Lcom/huawei/openalliance/ad/k/d$a;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/k/d;Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V

    :goto_0
    goto :goto_1

    :cond_6
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d$1;->f:Lcom/huawei/openalliance/ad/k/d;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/d$1;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/k/d$1;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/k/d$1;->e:Lcom/huawei/openalliance/ad/download/app/c;

    iget-object v4, p0, Lcom/huawei/openalliance/ad/k/d$1;->c:Lcom/huawei/openalliance/ad/k/d$a;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/k/d;Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V

    :goto_1
    return-void
.end method
