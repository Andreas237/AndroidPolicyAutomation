.class Lo/ehb$d$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ehb$d;->b(II)Lo/ehb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ehb$d;

.field final synthetic e:Lo/ehb;


# direct methods
.method constructor <init>(Lo/ehb$d;Lo/ehb;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lo/ehb$d$5;->a:Lo/ehb$d;

    iput-object p2, p0, Lo/ehb$d$5;->e:Lo/ehb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 105
    iget-object v0, p0, Lo/ehb$d$5;->e:Lo/ehb;

    invoke-virtual {v0}, Lo/ehb;->dismiss()V

    .line 106
    return-void
.end method
