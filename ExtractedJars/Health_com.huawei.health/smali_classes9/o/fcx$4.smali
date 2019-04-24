.class Lo/fcx$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egz$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fcx;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fcx;


# direct methods
.method constructor <init>(Lo/fcx;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lo/fcx$4;->a:Lo/fcx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/app/Dialog;IILjava/lang/String;)V
    .locals 0

    .line 297
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 298
    return-void
.end method
