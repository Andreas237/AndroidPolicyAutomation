.class final Lo/evc$5;
.super Lo/evl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/evc;->c(Ljava/lang/String;Ljava/lang/String;Lo/evd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lo/evd;


# direct methods
.method constructor <init>(Ljava/lang/String;Lo/evd;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lo/evc$5;->c:Ljava/lang/String;

    iput-object p2, p0, Lo/evc$5;->d:Lo/evd;

    invoke-direct {p0}, Lo/evl;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JJZ)V
    .locals 6

    .line 90
    iget-object v0, p0, Lo/evc$5;->d:Lo/evd;

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/evd;->c(JJZ)V

    .line 91
    return-void
.end method

.method public a(Lokhttp3/Request;Ljava/lang/Exception;)V
    .locals 2

    .line 80
    iget-object v0, p0, Lo/evc$5;->c:Ljava/lang/String;

    iget-object v1, p0, Lo/evc$5;->d:Lo/evd;

    invoke-static {v0, p2, v1}, Lo/evc;->a(Ljava/lang/String;Ljava/lang/Exception;Lo/evd;)V

    .line 81
    return-void
.end method

.method public c(Lorg/json/JSONObject;)V
    .locals 2

    .line 85
    iget-object v0, p0, Lo/evc$5;->c:Ljava/lang/String;

    iget-object v1, p0, Lo/evc$5;->d:Lo/evd;

    invoke-static {v0, p1, v1}, Lo/evc;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/evd;)V

    .line 86
    return-void
.end method
