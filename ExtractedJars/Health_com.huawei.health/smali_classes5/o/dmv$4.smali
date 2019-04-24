.class Lo/dmv$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dmv;->b(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic e:Lo/dmv;


# direct methods
.method constructor <init>(Lo/dmv;Landroid/app/Activity;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lo/dmv$4;->e:Lo/dmv;

    iput-object p2, p0, Lo/dmv$4;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 151
    iget-object v0, p0, Lo/dmv$4;->e:Lo/dmv;

    const/4 v1, 0x0

    iput-object v1, v0, Lo/dmv;->c:Lo/egw;

    .line 152
    iget-object v0, p0, Lo/dmv$4;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 153
    return-void
.end method
