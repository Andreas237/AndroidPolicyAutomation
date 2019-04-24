.class final Lo/bpu$5;
.super Lo/bpu;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bpu;->get(Ljava/lang/String;)Lo/bpu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lo/bpu$5;->a:Ljava/lang/String;

    invoke-direct {p0}, Lo/bpu;-><init>()V

    return-void
.end method


# virtual methods
.method public getRequestUrl()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lo/bpu$5;->a:Ljava/lang/String;

    return-object v0
.end method
