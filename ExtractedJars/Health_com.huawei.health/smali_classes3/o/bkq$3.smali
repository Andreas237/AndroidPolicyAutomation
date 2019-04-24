.class Lo/bkq$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bkq;->a(Lo/bfl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bkq;

.field final synthetic e:Lo/bfh;


# direct methods
.method constructor <init>(Lo/bkq;Lo/bfh;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lo/bkq$3;->b:Lo/bkq;

    iput-object p2, p0, Lo/bkq$3;->e:Lo/bfh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 131
    iget-object v0, p0, Lo/bkq$3;->b:Lo/bkq;

    iget-object v1, p0, Lo/bkq$3;->e:Lo/bfh;

    invoke-static {v0, v1}, Lo/bkq;->c(Lo/bkq;Lo/bfh;)V

    .line 132
    return-void
.end method
