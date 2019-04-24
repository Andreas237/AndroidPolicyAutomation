.class public Lorg/jivesoftware/smack/UnparseableStanza;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final content:Ljava/lang/CharSequence;

.field private final e:Ljava/lang/Exception;


# direct methods
.method constructor <init>(Ljava/lang/CharSequence;Ljava/lang/Exception;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lorg/jivesoftware/smack/UnparseableStanza;->content:Ljava/lang/CharSequence;

    .line 32
    iput-object p2, p0, Lorg/jivesoftware/smack/UnparseableStanza;->e:Ljava/lang/Exception;

    .line 33
    return-void
.end method


# virtual methods
.method public getContent()Ljava/lang/CharSequence;
    .locals 1

    .line 49
    iget-object v0, p0, Lorg/jivesoftware/smack/UnparseableStanza;->content:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getParsingException()Ljava/lang/Exception;
    .locals 1

    .line 40
    iget-object v0, p0, Lorg/jivesoftware/smack/UnparseableStanza;->e:Ljava/lang/Exception;

    return-object v0
.end method
