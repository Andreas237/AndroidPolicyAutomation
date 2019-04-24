.class Lo/emk$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/mf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/emk;->a(Lo/emi;Lo/elb;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/emk;


# direct methods
.method constructor <init>(Lo/emk;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lo/emk$4;->b:Lo/emk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(FLo/lh;)Ljava/lang/String;
    .locals 1

    .line 43
    invoke-static {p1}, Lo/emk;->e(F)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
