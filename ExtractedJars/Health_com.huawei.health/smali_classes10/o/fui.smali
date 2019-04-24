.class abstract Lo/fui;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fty;
.implements Ljava/io/Serializable;


# instance fields
.field protected a:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/fui;->a:Ljava/lang/String;

    return-object v0
.end method

.method protected readResolve()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    .line 68
    invoke-virtual {p0}, Lo/fui;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    return-object v0
.end method
