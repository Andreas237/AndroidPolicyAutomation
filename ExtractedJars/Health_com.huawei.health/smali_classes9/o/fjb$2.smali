.class final Lo/fjb$2;
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
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:[Z

.field final synthetic c:Z

.field final synthetic d:Lo/fhq;


# direct methods
.method constructor <init>([ZLo/fhq;ZLandroid/content/Context;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lo/fjb$2;->b:[Z

    iput-object p2, p0, Lo/fjb$2;->d:Lo/fhq;

    iput-boolean p3, p0, Lo/fjb$2;->c:Z

    iput-object p4, p0, Lo/fjb$2;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 194
    iget-object v0, p0, Lo/fjb$2;->b:[Z

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    if-nez v0, :cond_0

    .line 195
    iget-object v0, p0, Lo/fjb$2;->d:Lo/fhq;

    const/4 v1, 0x3

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/fhq;->d(IZ)V

    .line 197
    :cond_0
    iget-boolean v0, p0, Lo/fjb$2;->c:Z

    if-eqz v0, :cond_1

    .line 198
    iget-object v0, p0, Lo/fjb$2;->d:Lo/fhq;

    const/4 v1, 0x7

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/fhq;->d(IZ)V

    .line 200
    :cond_1
    iget-object v0, p0, Lo/fjb$2;->d:Lo/fhq;

    const/16 v1, 0x12d

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/fhq;->d(IZ)V

    .line 201
    iget-object v0, p0, Lo/fjb$2;->a:Landroid/content/Context;

    sget-object v1, Lo/dae;->ep:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-static {v0, v1, v2}, Lo/fjb;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    return-void
.end method
