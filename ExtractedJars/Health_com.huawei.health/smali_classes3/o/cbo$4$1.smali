.class Lo/cbo$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/czi;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbo$4;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cbo$4;


# direct methods
.method constructor <init>(Lo/cbo$4;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lo/cbo$4$1;->e:Lo/cbo$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 122
    const-string v0, "AgrSignDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AgrSignDialog_signAgrHttp exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    return-void
.end method
