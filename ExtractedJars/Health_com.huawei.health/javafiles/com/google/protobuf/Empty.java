// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, EmptyOrBuilder, InvalidProtocolBufferException, UnknownFieldSet, 
//			CodedInputStream, EmptyProto, Parser, ExtensionRegistryLite, 
//			ByteString, Message, MessageLite, CodedOutputStream, 
//			AbstractParser

public final class Empty extends GeneratedMessageV3
	implements EmptyOrBuilder
{
	public static final class Builder extends GeneratedMessageV3.Builder
		implements EmptyOrBuilder
	{

		public static final Descriptors.Descriptor getDescriptor()
		{
			return EmptyProto.internal_static_google_protobuf_Empty_descriptor;
		//    0    0:getstatic       #33  <Field Descriptors$Descriptor EmptyProto.internal_static_google_protobuf_Empty_descriptor>
		//    1    3:areturn         
		}

		private void maybeForceBuilderInitialization()
		{
			boolean flag = GeneratedMessageV3.alwaysUseFieldBuilders;
		//    0    0:getstatic       #39  <Field boolean GeneratedMessageV3.alwaysUseFieldBuilders>
		//    1    3:istore_1        
		//    2    4:return          
		}

		public Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.addRepeatedField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #44  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class Empty$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #46  <Method Empty$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder addRepeatedField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (addRepeatedField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #46  <Method Empty$Builder addRepeatedField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Empty build()
		{
			Empty empty = buildPartial();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #52  <Method Empty buildPartial()>
		//    2    4:astore_1        
			if(!empty.isInitialized())
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #56  <Method boolean Empty.isInitialized()>
		//*   5    9:ifne            17
				throw newUninitializedMessageException(((Message) (empty)));
		//    6   12:aload_1         
		//    7   13:invokestatic    #60  <Method UninitializedMessageException newUninitializedMessageException(Message)>
		//    8   16:athrow          
			else
				return empty;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public volatile Message build()
		{
			return ((Message) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #63  <Method Empty build()>
		//    2    4:areturn         
		}

		public volatile MessageLite build()
		{
			return ((MessageLite) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #63  <Method Empty build()>
		//    2    4:areturn         
		}

		public Empty buildPartial()
		{
			Empty empty = new Empty(((GeneratedMessageV3.Builder) (this)));
		//    0    0:new             #9   <Class Empty>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #67  <Method void Empty(GeneratedMessageV3$Builder, Empty$1)>
		//    5    9:astore_1        
			onBuilt();
		//    6   10:aload_0         
		//    7   11:invokevirtual   #70  <Method void onBuilt()>
			return empty;
		//    8   14:aload_1         
		//    9   15:areturn         
		}

		public volatile Message buildPartial()
		{
			return ((Message) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #52  <Method Empty buildPartial()>
		//    2    4:areturn         
		}

		public volatile MessageLite buildPartial()
		{
			return ((MessageLite) (buildPartial()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #52  <Method Empty buildPartial()>
		//    2    4:areturn         
		}

		public volatile AbstractMessage.Builder clear()
		{
			return ((AbstractMessage.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #75  <Method Empty$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clear()
		{
			super.clear();
		//    0    0:aload_0         
		//    1    1:invokespecial   #78  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clear()>
		//    2    4:pop             
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public volatile GeneratedMessageV3.Builder clear()
		{
			return ((GeneratedMessageV3.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #75  <Method Empty$Builder clear()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clear()
		{
			return ((Message.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #75  <Method Empty$Builder clear()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clear()
		{
			return ((MessageLite.Builder) (clear()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #75  <Method Empty$Builder clear()>
		//    2    4:areturn         
		}

		public Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return (Builder)super.clearField(fielddescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #85  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearField(Descriptors$FieldDescriptor)>
		//    3    5:checkcast       #2   <Class Empty$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #87  <Method Empty$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearField(Descriptors.FieldDescriptor fielddescriptor)
		{
			return ((Message.Builder) (clearField(fielddescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #87  <Method Empty$Builder clearField(Descriptors$FieldDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((AbstractMessage.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #93  <Method Empty$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return (Builder)super.clearOneof(oneofdescriptor);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #96  <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:checkcast       #2   <Class Empty$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((GeneratedMessageV3.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #93  <Method Empty$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile Message.Builder clearOneof(Descriptors.OneofDescriptor oneofdescriptor)
		{
			return ((Message.Builder) (clearOneof(oneofdescriptor)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #93  <Method Empty$Builder clearOneof(Descriptors$OneofDescriptor)>
		//    3    5:areturn         
		}

		public volatile AbstractMessage.Builder clone()
		{
			return ((AbstractMessage.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #100 <Method Empty$Builder clone()>
		//    2    4:areturn         
		}

		public volatile AbstractMessageLite.Builder clone()
		{
			return ((AbstractMessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #100 <Method Empty$Builder clone()>
		//    2    4:areturn         
		}

		public Builder clone()
		{
			return (Builder)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #103 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.clone()>
		//    2    4:checkcast       #2   <Class Empty$Builder>
		//    3    7:areturn         
		}

		public volatile GeneratedMessageV3.Builder clone()
		{
			return ((GeneratedMessageV3.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #100 <Method Empty$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Message.Builder clone()
		{
			return ((Message.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #100 <Method Empty$Builder clone()>
		//    2    4:areturn         
		}

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #100 <Method Empty$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #100 <Method Empty$Builder clone()>
		//    2    4:areturn         
		}

		public Empty getDefaultInstanceForType()
		{
			return Empty.getDefaultInstance();
		//    0    0:invokestatic    #111 <Method Empty Empty.getDefaultInstance()>
		//    1    3:areturn         
		}

		public volatile Message getDefaultInstanceForType()
		{
			return ((Message) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #113 <Method Empty getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public volatile MessageLite getDefaultInstanceForType()
		{
			return ((MessageLite) (getDefaultInstanceForType()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #113 <Method Empty getDefaultInstanceForType()>
		//    2    4:areturn         
		}

		public Descriptors.Descriptor getDescriptorForType()
		{
			return EmptyProto.internal_static_google_protobuf_Empty_descriptor;
		//    0    0:getstatic       #33  <Field Descriptors$Descriptor EmptyProto.internal_static_google_protobuf_Empty_descriptor>
		//    1    3:areturn         
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		{
			return EmptyProto.internal_static_google_protobuf_Empty_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/Empty, com/google/protobuf/Empty$Builder);
		//    0    0:getstatic       #120 <Field GeneratedMessageV3$FieldAccessorTable EmptyProto.internal_static_google_protobuf_Empty_fieldAccessorTable>
		//    1    3:ldc1            #9   <Class Empty>
		//    2    5:ldc1            #2   <Class Empty$Builder>
		//    3    7:invokevirtual   #126 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
		//    4   10:areturn         
		}

		public final boolean isInitialized()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessage.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #133 <Method Empty$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeFrom(Message message)
		{
			return ((AbstractMessage.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #137 <Method Empty$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile AbstractMessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((AbstractMessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #133 <Method Empty$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			CodedInputStream codedinputstream1;
			Object obj;
			obj = null;
		//    0    0:aconst_null     
		//    1    1:astore          4
			codedinputstream1 = ((CodedInputStream) (obj));
		//    2    3:aload           4
		//    3    5:astore_3        
			codedinputstream = ((CodedInputStream) ((Empty)Empty.PARSER.parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    4    6:invokestatic    #144 <Method Parser Empty.access$300()>
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokeinterface #150 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    8   16:checkcast       #9   <Class Empty>
		//    9   19:astore_1        
			if(codedinputstream != null)
		//*  10   20:aload_1         
		//*  11   21:ifnull          64
			{
				mergeFrom(((Empty) (codedinputstream)));
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #153 <Method Empty$Builder mergeFrom(Empty)>
		//   15   29:pop             
				return this;
		//   16   30:aload_0         
		//   17   31:areturn         
			} else
		//*  18   32:astore_2        
		//*  19   33:aload           4
		//*  20   35:astore_3        
		//*  21   36:aload_2         
		//*  22   37:invokevirtual   #156 <Method MessageLite InvalidProtocolBufferException.getUnfinishedMessage()>
		//*  23   40:checkcast       #9   <Class Empty>
		//*  24   43:astore_1        
		//*  25   44:aload_1         
		//*  26   45:astore_3        
		//*  27   46:aload_2         
		//*  28   47:invokevirtual   #160 <Method IOException InvalidProtocolBufferException.unwrapIOException()>
		//*  29   50:athrow          
		//*  30   51:astore_1        
		//*  31   52:aload_3         
		//*  32   53:ifnull          62
		//*  33   56:aload_0         
		//*  34   57:aload_3         
		//*  35   58:invokevirtual   #153 <Method Empty$Builder mergeFrom(Empty)>
		//*  36   61:pop             
		//*  37   62:aload_1         
		//*  38   63:athrow          
			{
				return this;
		//   39   64:aload_0         
		//   40   65:areturn         
			}
			extensionregistrylite;
			codedinputstream1 = ((CodedInputStream) (obj));
			codedinputstream = ((CodedInputStream) ((Empty)((InvalidProtocolBufferException) (extensionregistrylite)).getUnfinishedMessage()));
			codedinputstream1 = codedinputstream;
			throw ((InvalidProtocolBufferException) (extensionregistrylite)).unwrapIOException();
			codedinputstream;
			if(codedinputstream1 != null)
				mergeFrom(((Empty) (codedinputstream1)));
			throw codedinputstream;
		}

		public Builder mergeFrom(Empty empty)
		{
			if(empty == Empty.getDefaultInstance())
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #111 <Method Empty Empty.getDefaultInstance()>
		//*   2    4:if_acmpne       9
			{
				return this;
		//    3    7:aload_0         
		//    4    8:areturn         
			} else
			{
				mergeUnknownFields(empty.unknownFields);
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:getfield        #164 <Field UnknownFieldSet Empty.unknownFields>
		//    8   14:invokevirtual   #168 <Method Empty$Builder mergeUnknownFields(UnknownFieldSet)>
		//    9   17:pop             
				onChanged();
		//   10   18:aload_0         
		//   11   19:invokevirtual   #171 <Method void onChanged()>
				return this;
		//   12   22:aload_0         
		//   13   23:areturn         
			}
		}

		public Builder mergeFrom(Message message)
		{
			if(message instanceof Empty)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #9   <Class Empty>
		//*   2    4:ifeq            16
			{
				return mergeFrom((Empty)message);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #9   <Class Empty>
		//    6   12:invokevirtual   #153 <Method Empty$Builder mergeFrom(Empty)>
		//    7   15:areturn         
			} else
			{
				super.mergeFrom(message);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #173 <Method AbstractMessage$Builder GeneratedMessageV3$Builder.mergeFrom(Message)>
		//   11   21:pop             
				return this;
		//   12   22:aload_0         
		//   13   23:areturn         
			}
		}

		public volatile Message.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((Message.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #133 <Method Empty$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile Message.Builder mergeFrom(Message message)
		{
			return ((Message.Builder) (mergeFrom(message)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #137 <Method Empty$Builder mergeFrom(Message)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #133 <Method Empty$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((AbstractMessage.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #168 <Method Empty$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.mergeUnknownFields(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #180 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.mergeUnknownFields(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class Empty$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #168 <Method Empty$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder mergeUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (mergeUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #168 <Method Empty$Builder mergeUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return (Builder)super.setField(fielddescriptor, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #184 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:checkcast       #2   <Class Empty$Builder>
		//    5    9:areturn         
		}

		public volatile GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #186 <Method Empty$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public volatile Message.Builder setField(Descriptors.FieldDescriptor fielddescriptor, Object obj)
		{
			return ((Message.Builder) (setField(fielddescriptor, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #186 <Method Empty$Builder setField(Descriptors$FieldDescriptor, Object)>
		//    4    6:areturn         
		}

		public Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return (Builder)super.setRepeatedField(fielddescriptor, i, obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #191 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:checkcast       #2   <Class Empty$Builder>
		//    6   10:areturn         
		}

		public volatile GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((GeneratedMessageV3.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #193 <Method Empty$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public volatile Message.Builder setRepeatedField(Descriptors.FieldDescriptor fielddescriptor, int i, Object obj)
		{
			return ((Message.Builder) (setRepeatedField(fielddescriptor, i, obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #193 <Method Empty$Builder setRepeatedField(Descriptors$FieldDescriptor, int, Object)>
		//    5    7:areturn         
		}

		public final Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return (Builder)super.setUnknownFieldsProto3(unknownfieldset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #198 <Method GeneratedMessageV3$Builder GeneratedMessageV3$Builder.setUnknownFieldsProto3(UnknownFieldSet)>
		//    3    5:checkcast       #2   <Class Empty$Builder>
		//    4    8:areturn         
		}

		public volatile GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((GeneratedMessageV3.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #200 <Method Empty$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		public volatile Message.Builder setUnknownFields(UnknownFieldSet unknownfieldset)
		{
			return ((Message.Builder) (setUnknownFields(unknownfieldset)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #200 <Method Empty$Builder setUnknownFields(UnknownFieldSet)>
		//    3    5:areturn         
		}

		private Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void GeneratedMessageV3$Builder()>
			maybeForceBuilderInitialization();
		//    2    4:aload_0         
		//    3    5:invokespecial   #17  <Method void maybeForceBuilderInitialization()>
		//    4    8:return          
		}


		private Builder(GeneratedMessageV3.BuilderParent builderparent)
		{
			super(builderparent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #23  <Method void GeneratedMessageV3$Builder(GeneratedMessageV3$BuilderParent)>
			maybeForceBuilderInitialization();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void maybeForceBuilderInitialization()>
		//    5    9:return          
		}

	}


	private Empty()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #36  <Field byte memoizedIsInitialized>
	//    5    9:return          
	}

	private Empty(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		boolean flag;
		UnknownFieldSet.Builder builder;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Empty()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #43  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #44  <Method void NullPointerException()>
	//    7   15:athrow          
		builder = UnknownFieldSet.newBuilder();
	//    8   16:invokestatic    #50  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//    9   19:astore          6
		flag = false;
	//   10   21:iconst_0        
	//   11   22:istore_3        
_L6:
		if(flag) goto _L2; else goto _L1
	//   12   23:iload_3         
	//   13   24:ifne            74
_L1:
		int i = codedinputstream.readTag();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #56  <Method int CodedInputStream.readTag()>
	//   16   31:istore          4
		i;
	//   17   33:iload           4
		JVM INSTR lookupswitch 1: default 125
	//	               0: 128;
	//   18   35:lookupswitch    1: default 125
	//	               0: 128
		   goto _L3 _L4
_L3:
		boolean flag1 = parseUnknownFieldProto3(codedinputstream, builder, extensionregistrylite, i);
	//   19   52:aload_0         
	//   20   53:aload_1         
	//   21   54:aload           6
	//   22   56:aload_2         
	//   23   57:iload           4
	//   24   59:invokevirtual   #60  <Method boolean parseUnknownFieldProto3(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//   25   62:istore          5
		if(!flag1)
	//*  26   64:iload           5
	//*  27   66:ifne            71
			flag = true;
	//   28   69:iconst_1        
	//   29   70:istore_3        
		continue; /* Loop/switch isn't completed */
	//   30   71:goto            23
_L2:
		unknownFields = builder.build();
	//   31   74:aload_0         
	//   32   75:aload           6
	//   33   77:invokevirtual   #66  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   34   80:putfield        #70  <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   35   83:aload_0         
	//   36   84:invokevirtual   #73  <Method void makeExtensionsImmutable()>
		return;
	//   37   87:return          
		codedinputstream;
	//   38   88:astore_1        
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//   39   89:aload_1         
	//   40   90:aload_0         
	//   41   91:invokevirtual   #77  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   42   94:athrow          
		codedinputstream;
	//   43   95:astore_1        
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//   44   96:new             #39  <Class InvalidProtocolBufferException>
	//   45   99:dup             
	//   46  100:aload_1         
	//   47  101:invokespecial   #80  <Method void InvalidProtocolBufferException(IOException)>
	//   48  104:aload_0         
	//   49  105:invokevirtual   #77  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   50  108:athrow          
		codedinputstream;
	//   51  109:astore_1        
		unknownFields = builder.build();
	//   52  110:aload_0         
	//   53  111:aload           6
	//   54  113:invokevirtual   #66  <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//   55  116:putfield        #70  <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//   56  119:aload_0         
	//   57  120:invokevirtual   #73  <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//   58  123:aload_1         
	//   59  124:athrow          
	//*  60  125:goto            52
_L4:
		flag = true;
	//   61  128:iconst_1        
	//   62  129:istore_3        
		if(true) goto _L6; else goto _L5
	//   63  130:goto            71
_L5:
	}


	private Empty(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #87  <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #36  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}


	public static Empty getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #29  <Field Empty DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return EmptyProto.internal_static_google_protobuf_Empty_descriptor;
	//    0    0:getstatic       #103 <Field Descriptors$Descriptor EmptyProto.internal_static_google_protobuf_Empty_descriptor>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #29  <Field Empty DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #107 <Method Empty$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(Empty empty)
	{
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(empty);
	//    0    0:getstatic       #29  <Field Empty DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #107 <Method Empty$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #111 <Method Empty$Builder Empty$Builder.mergeFrom(Empty)>
	//    4   10:areturn         
	}

	public static Empty parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (Empty)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #32  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #117 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class Empty>
	//    4   10:areturn         
	}

	public static Empty parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (Empty)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #32  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #121 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class Empty>
	//    5   11:areturn         
	}

	public static Empty parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (Empty)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #32  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #128 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class Empty>
	//    4   12:areturn         
	}

	public static Empty parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (Empty)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #32  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #132 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class Empty>
	//    5   13:areturn         
	}

	public static Empty parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (Empty)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #32  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #137 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class Empty>
	//    4   10:areturn         
	}

	public static Empty parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (Empty)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #32  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #141 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class Empty>
	//    5   11:areturn         
	}

	public static Empty parseFrom(InputStream inputstream)
		throws IOException
	{
		return (Empty)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #32  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #143 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class Empty>
	//    4   10:areturn         
	}

	public static Empty parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (Empty)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #32  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #145 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class Empty>
	//    5   11:areturn         
	}

	public static Empty parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (Empty)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #32  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #149 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class Empty>
	//    4   12:areturn         
	}

	public static Empty parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (Empty)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #32  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #153 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class Empty>
	//    5   13:areturn         
	}

	public static Empty parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (Empty)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #32  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #157 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class Empty>
	//    4   12:areturn         
	}

	public static Empty parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (Empty)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #32  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #161 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class Empty>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #32  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof Empty))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Empty>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #167 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((Empty)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class Empty>
	//   14   24:astore_1        
		return true && unknownFields.equals(((Object) (((Empty) (obj)).unknownFields)));
	//   15   25:iconst_1        
	//   16   26:ifeq            45
	//   17   29:aload_0         
	//   18   30:getfield        #70  <Field UnknownFieldSet unknownFields>
	//   19   33:aload_1         
	//   20   34:getfield        #70  <Field UnknownFieldSet unknownFields>
	//   21   37:invokevirtual   #168 <Method boolean UnknownFieldSet.equals(Object)>
	//   22   40:ifeq            45
	//   23   43:iconst_1        
	//   24   44:ireturn         
	//   25   45:iconst_0        
	//   26   46:ireturn         
	}

	public Empty getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #29  <Field Empty DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method Empty getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method Empty getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #32  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field int memoizedSize>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
		{
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		} else
		{
			int j = unknownFields.getSerializedSize() + 0;
	//    8   12:aload_0         
	//    9   13:getfield        #70  <Field UnknownFieldSet unknownFields>
	//   10   16:invokevirtual   #181 <Method int UnknownFieldSet.getSerializedSize()>
	//   11   19:iconst_0        
	//   12   20:iadd            
	//   13   21:istore_1        
			memoizedSize = j;
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:putfield        #179 <Field int memoizedSize>
			return j;
	//   17   27:iload_1         
	//   18   28:ireturn         
		}
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		if(memoizedHashCode != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #186 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
		{
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #186 <Field int memoizedHashCode>
	//    5   11:ireturn         
		} else
		{
			int i = (((Object) (getDescriptor())).hashCode() + 779) * 29 + unknownFields.hashCode();
	//    6   12:invokestatic    #188 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #192 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:bipush          29
	//   11   24:imul            
	//   12   25:aload_0         
	//   13   26:getfield        #70  <Field UnknownFieldSet unknownFields>
	//   14   29:invokevirtual   #193 <Method int UnknownFieldSet.hashCode()>
	//   15   32:iadd            
	//   16   33:istore_1        
			memoizedHashCode = i;
	//   17   34:aload_0         
	//   18   35:iload_1         
	//   19   36:putfield        #186 <Field int memoizedHashCode>
			return i;
	//   20   39:iload_1         
	//   21   40:ireturn         
		}
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return EmptyProto.internal_static_google_protobuf_Empty_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/Empty, com/google/protobuf/Empty$Builder);
	//    0    0:getstatic       #199 <Field GeneratedMessageV3$FieldAccessorTable EmptyProto.internal_static_google_protobuf_Empty_fieldAccessorTable>
	//    1    3:ldc1            #2   <Class Empty>
	//    2    5:ldc1            #10  <Class Empty$Builder>
	//    3    7:invokevirtual   #205 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field byte memoizedIsInitialized>
	//    2    4:istore_1        
		if(byte0 == 1)
	//*   3    5:iload_1         
	//*   4    6:iconst_1        
	//*   5    7:icmpne          12
			return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if(byte0 == 0)
	//*   8   12:iload_1         
	//*   9   13:ifne            18
		{
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:putfield        #36  <Field byte memoizedIsInitialized>
			return true;
	//   15   23:iconst_1        
	//   16   24:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #210 <Method Empty$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent);
	//    0    0:new             #10  <Class Empty$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #214 <Method void Empty$Builder(GeneratedMessageV3$BuilderParent, Empty$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method Empty$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #220 <Method Empty$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method Empty$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #29  <Field Empty DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder();
	//    3    7:new             #10  <Class Empty$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #224 <Method void Empty$Builder(Empty$1)>
	//    7   15:areturn         
		else
			return (new Builder()).mergeFrom(this);
	//    8   16:new             #10  <Class Empty$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #224 <Method void Empty$Builder(Empty$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #111 <Method Empty$Builder Empty$Builder.mergeFrom(Empty)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method Empty$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method Empty$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		unknownFields.writeTo(codedoutputstream);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field UnknownFieldSet unknownFields>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #228 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//    4    8:return          
	}

	private static final Empty DEFAULT_INSTANCE = new Empty();
	private static final Parser PARSER = new AbstractParser() {

		public Empty parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return new Empty(codedinputstream, extensionregistrylite);
		//    0    0:new             #7   <Class Empty>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #19  <Method void Empty(CodedInputStream, ExtensionRegistryLite, Empty$1)>
		//    6   10:areturn         
		}

		public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #23  <Method Empty parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

	}
;
	private static final long serialVersionUID = 0L;
	private byte memoizedIsInitialized;

	static 
	{
	//    0    0:new             #2   <Class Empty>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void Empty()>
	//    3    7:putstatic       #29  <Field Empty DEFAULT_INSTANCE>
	//    4   10:new             #8   <Class Empty$1>
	//    5   13:dup             
	//    6   14:invokespecial   #30  <Method void Empty$1()>
	//    7   17:putstatic       #32  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static Parser access$300()
	{
		return PARSER;
	//    0    0:getstatic       #32  <Field Parser PARSER>
	//    1    3:areturn         
	}

*/
}
