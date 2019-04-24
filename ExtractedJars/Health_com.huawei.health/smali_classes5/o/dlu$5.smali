.class Lo/dlu$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlu;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dlu;

.field final synthetic b:I

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/dlu;ILjava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lo/dlu$5;->a:Lo/dlu;

    iput p2, p0, Lo/dlu$5;->b:I

    iput-object p3, p0, Lo/dlu$5;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 132
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg hasBloodpresureData err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    const v0, 0x186a1

    if-ne p1, v0, :cond_0

    .line 134
    iget-object v0, p0, Lo/dlu$5;->a:Lo/dlu;

    iget v1, p0, Lo/dlu$5;->b:I

    iget-object v2, p0, Lo/dlu$5;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/dlu;->c(Lo/dlu;ILjava/lang/String;)V

    goto :goto_0

    .line 136
    :cond_0
    iget-object v0, p0, Lo/dlu$5;->a:Lo/dlu;

    iget-object v0, v0, Lo/dlu;->b:Landroid/content/Context;

    const/16 v1, 0x7531

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 138
    :goto_0
    return-void
.end method
