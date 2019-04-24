.class Lo/emh$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eim$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/emh;->a(Lo/emi;Lo/elb;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/emh;


# direct methods
.method constructor <init>(Lo/emh;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lo/emh$4;->e:Lo/emh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 0

    .line 26
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 27
    return-object p1
.end method
