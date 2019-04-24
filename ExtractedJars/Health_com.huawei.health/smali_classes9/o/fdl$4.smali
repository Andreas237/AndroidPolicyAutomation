.class Lo/fdl$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fdl;->b(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lo/egw;

.field final synthetic c:Lo/fdl;


# direct methods
.method constructor <init>(Lo/fdl;Landroid/app/Activity;Lo/egw;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lo/fdl$4;->c:Lo/fdl;

    iput-object p2, p0, Lo/fdl$4;->a:Landroid/app/Activity;

    iput-object p3, p0, Lo/fdl$4;->b:Lo/egw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 170
    iget-object v0, p0, Lo/fdl$4;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/fdl;->e(Landroid/app/Activity;)V

    .line 171
    iget-object v0, p0, Lo/fdl$4;->b:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 172
    return-void
.end method
