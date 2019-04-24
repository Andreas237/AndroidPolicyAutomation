.class Lo/fdb$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fgj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fdb;->b(Lo/acu;ILo/fgj$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fdb;


# direct methods
.method constructor <init>(Lo/fdb;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lo/fdb$2;->a:Lo/fdb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/app/Dialog;III)V
    .locals 0

    .line 171
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 172
    return-void
.end method
