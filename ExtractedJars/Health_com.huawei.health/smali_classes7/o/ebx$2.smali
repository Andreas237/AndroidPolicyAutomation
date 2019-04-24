.class Lo/ebx$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ebx;->b(Lo/dav;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ebx;


# direct methods
.method constructor <init>(Lo/ebx;)V
    .locals 0

    .line 291
    iput-object p1, p0, Lo/ebx$2;->a:Lo/ebx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 294
    iget-object v0, p0, Lo/ebx$2;->a:Lo/ebx;

    invoke-static {v0}, Lo/ebx;->b(Lo/ebx;)V

    .line 295
    return-void
.end method
