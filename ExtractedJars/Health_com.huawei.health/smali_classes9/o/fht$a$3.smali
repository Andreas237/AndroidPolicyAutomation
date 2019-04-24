.class Lo/fht$a$3;
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
.field final synthetic c:Lo/fht$a;


# direct methods
.method constructor <init>(Lo/fht$a;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lo/fht$a$3;->c:Lo/fht$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 124
    iget-object v0, p0, Lo/fht$a$3;->c:Lo/fht$a;

    iget-object v0, v0, Lo/fht$a;->c:Lo/fht;

    invoke-virtual {v0}, Lo/fht;->dismiss()V

    .line 125
    return-void
.end method
