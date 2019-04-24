.class Lo/cbm$d$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbm$d;->c(Lo/ale;)Landroid/support/v4/view/PagerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cbm$d;


# direct methods
.method constructor <init>(Lo/cbm$d;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lo/cbm$d$3;->c:Lo/cbm$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 165
    iget-object v0, p0, Lo/cbm$d$3;->c:Lo/cbm$d;

    invoke-static {v0}, Lo/cbm$d;->d(Lo/cbm$d;)Lo/fhm;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fhm;->setCurrentItem(I)V

    .line 166
    return-void
.end method
