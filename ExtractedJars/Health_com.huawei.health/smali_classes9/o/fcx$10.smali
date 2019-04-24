.class Lo/fcx$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fcx;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/fcx;


# direct methods
.method constructor <init>(Lo/fcx;)V
    .locals 0

    .line 309
    iput-object p1, p0, Lo/fcx$10;->d:Lo/fcx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 312
    iget-object v0, p0, Lo/fcx$10;->d:Lo/fcx;

    invoke-static {v0}, Lo/fcx;->k(Lo/fcx;)V

    .line 313
    return-void
.end method
