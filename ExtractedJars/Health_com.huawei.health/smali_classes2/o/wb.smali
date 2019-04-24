.class public Lo/wb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private d:I

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/wc;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lo/wb;->b:Ljava/lang/String;

    .line 23
    return-void
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/wc;>;)V"
        }
    .end annotation

    .line 14
    iput-object p1, p0, Lo/wb;->e:Ljava/util/ArrayList;

    .line 15
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 30
    iput p1, p0, Lo/wb;->d:I

    .line 31
    return-void
.end method

.method public e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/wc;>;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lo/wb;->e:Ljava/util/ArrayList;

    return-object v0
.end method
