.class Lo/ffm$d$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffm$d;->b()Lo/ffm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ffm;

.field final synthetic c:Lo/ffm$d;


# direct methods
.method constructor <init>(Lo/ffm$d;Lo/ffm;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lo/ffm$d$1;->c:Lo/ffm$d;

    iput-object p2, p0, Lo/ffm$d$1;->b:Lo/ffm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 92
    iget-object v0, p0, Lo/ffm$d$1;->b:Lo/ffm;

    invoke-virtual {v0}, Lo/ffm;->dismiss()V

    .line 93
    return-void
.end method
