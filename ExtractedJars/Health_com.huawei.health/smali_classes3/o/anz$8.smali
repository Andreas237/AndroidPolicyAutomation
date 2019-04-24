.class final Lo/anz$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aol;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/anz;->c(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lo/aog;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aog;


# direct methods
.method constructor <init>(Lo/aog;)V
    .locals 0

    .line 215
    iput-object p1, p0, Lo/anz$8;->a:Lo/aog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 1

    .line 218
    iget-object v0, p0, Lo/anz$8;->a:Lo/aog;

    invoke-static {p1, p2, v0}, Lo/anz;->a(ILjava/lang/String;Lo/aog;)V

    .line 219
    return-void
.end method
