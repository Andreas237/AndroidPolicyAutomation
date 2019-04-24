.class Lo/fdl$2;
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
.field final synthetic a:Lo/egw;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic e:Lo/fdl;


# direct methods
.method constructor <init>(Lo/fdl;Landroid/app/Activity;Lo/egw;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lo/fdl$2;->e:Lo/fdl;

    iput-object p2, p0, Lo/fdl$2;->b:Landroid/app/Activity;

    iput-object p3, p0, Lo/fdl$2;->a:Lo/egw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 162
    iget-object v0, p0, Lo/fdl$2;->e:Lo/fdl;

    iget-object v1, p0, Lo/fdl$2;->b:Landroid/app/Activity;

    invoke-static {v0, v1}, Lo/fdl;->d(Lo/fdl;Landroid/app/Activity;)V

    .line 163
    iget-object v0, p0, Lo/fdl$2;->a:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 164
    return-void
.end method
