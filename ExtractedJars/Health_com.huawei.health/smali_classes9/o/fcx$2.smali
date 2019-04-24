.class Lo/fcx$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egz$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fcx;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic e:Lo/fcx;


# direct methods
.method constructor <init>(Lo/fcx;I)V
    .locals 0

    .line 279
    iput-object p1, p0, Lo/fcx$2;->e:Lo/fcx;

    iput p2, p0, Lo/fcx$2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/app/Dialog;IILjava/lang/String;)V
    .locals 4

    .line 282
    if-eqz p4, :cond_0

    .line 283
    iget-object v0, p0, Lo/fcx$2;->e:Lo/fcx;

    iget-object v1, p0, Lo/fcx$2;->e:Lo/fcx;

    iget-object v1, v1, Lo/fcx;->e:Landroid/app/Activity;

    invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/fdd;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lo/fcx;->d(Lo/fcx;I)I

    .line 284
    const-string v0, "BloodSugarBeforeInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "timePeriod = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fcx$2;->e:Lo/fcx;

    invoke-static {v2}, Lo/fcx;->a(Lo/fcx;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    :cond_0
    iget v0, p0, Lo/fcx$2;->a:I

    if-nez v0, :cond_1

    .line 287
    iget-object v0, p0, Lo/fcx$2;->e:Lo/fcx;

    invoke-static {v0}, Lo/fcx;->e(Lo/fcx;)V

    goto :goto_0

    .line 289
    :cond_1
    iget-object v0, p0, Lo/fcx$2;->e:Lo/fcx;

    invoke-static {v0, p4}, Lo/fcx;->e(Lo/fcx;Ljava/lang/String;)V

    .line 291
    :goto_0
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 292
    return-void
.end method
