.class Lo/aeo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aes;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aeo;->e(Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/aeo;


# direct methods
.method constructor <init>(Lo/aeo;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lo/aeo$5;->b:Lo/aeo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    .line 67
    iget-object v0, p0, Lo/aeo$5;->b:Lo/aeo;

    invoke-static {v0}, Lo/aeo;->c(Lo/aeo;)V

    return-void
.end method

.method public c()V
    .locals 1

    .line 70
    iget-object v0, p0, Lo/aeo$5;->b:Lo/aeo;

    invoke-static {v0}, Lo/aeo;->c(Lo/aeo;)V

    return-void
.end method
