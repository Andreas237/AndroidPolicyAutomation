.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bwy$b;
.implements Lo/byn$d;
.implements Lo/bws$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

.field private d:Lo/bws$b;

.field private e:Lo/bwy$b;


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;)V
    .locals 0

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

    .line 127
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 2

    .line 146
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;)Lo/bwu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bwu;->a(Ljava/lang/String;)V

    .line 147
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;->d:Lo/bws$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 148
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;->d:Lo/bws$b;

    invoke-interface {v0, p1}, Lo/bws$b;->a(Ljava/lang/String;)Z

    .line 150
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 2

    .line 166
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;->e:Lo/bwy$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;->e:Lo/bwy$b;

    invoke-interface {v0}, Lo/bwy$b;->b()V

    .line 169
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 2

    .line 155
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->d()V

    .line 158
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;->d:Lo/bws$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 159
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;->d:Lo/bws$b;

    invoke-interface {v0, p1}, Lo/bws$b;->b(Ljava/lang/String;)Z

    .line 161
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public d(Lo/bws$b;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;->d:Lo/bws$b;

    .line 131
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 4

    .line 140
    const-string v0, "FitSearchActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick text="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity;)Lo/bws;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bws;->a(Ljava/lang/String;)V

    .line 142
    return-void
.end method

.method public e(Lo/bwy$b;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitSearchActivity$c;->e:Lo/bwy$b;

    .line 135
    return-void
.end method
