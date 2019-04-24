.class final Lo/fjb$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fjb;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fhq;

.field final synthetic b:Z

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:[Z


# direct methods
.method constructor <init>([ZLo/fhq;ZLandroid/content/Context;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lo/fjb$1;->d:[Z

    iput-object p2, p0, Lo/fjb$1;->a:Lo/fhq;

    iput-boolean p3, p0, Lo/fjb$1;->b:Z

    iput-object p4, p0, Lo/fjb$1;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 181
    iget-object v0, p0, Lo/fjb$1;->d:[Z

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    if-nez v0, :cond_0

    .line 182
    iget-object v0, p0, Lo/fjb$1;->a:Lo/fhq;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fhq;->d(IZ)V

    .line 184
    :cond_0
    iget-boolean v0, p0, Lo/fjb$1;->b:Z

    if-eqz v0, :cond_1

    .line 185
    iget-object v0, p0, Lo/fjb$1;->a:Lo/fhq;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fhq;->d(IZ)V

    .line 187
    :cond_1
    iget-object v0, p0, Lo/fjb$1;->a:Lo/fhq;

    const/16 v1, 0x12d

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fhq;->d(IZ)V

    .line 188
    iget-object v0, p0, Lo/fjb$1;->c:Landroid/content/Context;

    sget-object v1, Lo/dae;->ep:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-static {v0, v1, v2}, Lo/fjb;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    return-void
.end method
