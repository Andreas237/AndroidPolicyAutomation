.class public final Lorg/jivesoftware/smack/provider/ExtensionProviderInfo;
.super Lo/fsx;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/provider/ExtensionElementProvider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/provider/ExtensionElementProvider<Lorg/jivesoftware/smack/packet/ExtensionElement;>;)V"
        }
    .end annotation

    .line 38
    invoke-direct {p0, p1, p2, p3}, Lo/fsx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    return-void
.end method


# virtual methods
.method public bridge synthetic getElementName()Ljava/lang/String;
    .locals 1

    .line 28
    invoke-super {p0}, Lo/fsx;->getElementName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getNamespace()Ljava/lang/String;
    .locals 1

    .line 28
    invoke-super {p0}, Lo/fsx;->getNamespace()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
