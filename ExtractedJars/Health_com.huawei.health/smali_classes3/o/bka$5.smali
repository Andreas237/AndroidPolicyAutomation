.class Lo/bka$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bjy$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bka;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bka;


# direct methods
.method constructor <init>(Lo/bka;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lo/bka$5;->d:Lo/bka;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 117
    iget-object v0, p0, Lo/bka$5;->d:Lo/bka;

    invoke-static {v0}, Lo/bka;->e(Lo/bka;)V

    .line 118
    return-void
.end method
