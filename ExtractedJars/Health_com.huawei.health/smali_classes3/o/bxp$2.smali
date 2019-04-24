.class Lo/bxp$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxp;-><init>(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bxp;


# direct methods
.method constructor <init>(Lo/bxp;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lo/bxp$2;->d:Lo/bxp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 44
    iget-object v0, p0, Lo/bxp$2;->d:Lo/bxp;

    invoke-static {v0}, Lo/bxp;->d(Lo/bxp;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 45
    return-void
.end method
