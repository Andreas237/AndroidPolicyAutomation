.class Lo/bhb$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bhb;->e(Lo/bfh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ayh;

.field final synthetic c:Lo/bhb;


# direct methods
.method constructor <init>(Lo/bhb;Lo/ayh;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lo/bhb$3;->c:Lo/bhb;

    iput-object p2, p0, Lo/bhb$3;->a:Lo/ayh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 157
    iget-object v0, p0, Lo/bhb$3;->c:Lo/bhb;

    iget-object v1, p0, Lo/bhb$3;->a:Lo/ayh;

    invoke-static {v0, v1}, Lo/bhb;->d(Lo/bhb;Lo/ayh;)V

    .line 158
    return-void
.end method
