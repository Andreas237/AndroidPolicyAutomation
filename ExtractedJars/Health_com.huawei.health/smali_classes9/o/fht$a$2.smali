.class Lo/fht$a$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fht$a;->d()Landroid/support/v4/view/PagerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fht$a;


# direct methods
.method constructor <init>(Lo/fht$a;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lo/fht$a$2;->a:Lo/fht$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 161
    iget-object v0, p0, Lo/fht$a$2;->a:Lo/fht$a;

    invoke-static {v0}, Lo/fht$a;->e(Lo/fht$a;)Lo/fhm;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fhm;->setCurrentItem(I)V

    .line 162
    return-void
.end method
