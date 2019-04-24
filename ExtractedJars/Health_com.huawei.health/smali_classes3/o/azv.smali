.class final Lo/azv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/debugger/SmackDebuggerFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/azv$d;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lorg/jivesoftware/smack/XMPPConnection;Ljava/io/Writer;Ljava/io/Reader;)Lorg/jivesoftware/smack/debugger/SmackDebugger;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 54
    new-instance v0, Lo/azv$d;

    invoke-direct {v0, p1, p2, p3}, Lo/azv$d;-><init>(Lorg/jivesoftware/smack/XMPPConnection;Ljava/io/Writer;Ljava/io/Reader;)V

    return-object v0
.end method
