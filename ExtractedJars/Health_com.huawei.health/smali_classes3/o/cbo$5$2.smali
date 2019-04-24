.class Lo/cbo$5$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/czi;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbo$5;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cbo$5;


# direct methods
.method constructor <init>(Lo/cbo$5;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lo/cbo$5$2;->b:Lo/cbo$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 162
    const-string v0, "AgrSignDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AgrSignDialog_signAgrHttp exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    return-void
.end method
