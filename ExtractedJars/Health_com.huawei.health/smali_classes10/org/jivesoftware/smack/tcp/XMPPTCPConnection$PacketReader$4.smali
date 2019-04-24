.class Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;


# direct methods
.method constructor <init>(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;)V
    .locals 0

    .line 434
    iput-object p1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader$4;->a:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 437
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader$4;->a:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->access$200(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;)V

    .line 438
    return-void
.end method
