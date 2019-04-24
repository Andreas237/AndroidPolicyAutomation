.class final Lo/bpu$1;
.super Lo/bpu;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bpu;->get(Ljava/lang/String;Ljava/lang/String;)Lo/bpu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lo/bpu$1;->c:Ljava/lang/String;

    iput-object p2, p0, Lo/bpu$1;->b:Ljava/lang/String;

    invoke-direct {p0}, Lo/bpu;-><init>()V

    return-void
.end method


# virtual methods
.method public getCookie()Ljava/lang/String;
    .locals 1

    .line 113
    iget-object v0, p0, Lo/bpu$1;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getRequestUrl()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lo/bpu$1;->c:Ljava/lang/String;

    return-object v0
.end method
