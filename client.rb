

class Client

  def run
    cmd = "curl 'http://localhost:5555/compute-service/add?a=5&b=6'"
    system cmd
    puts
    cmd = "curl 'http://localhost:5555/product-service/all'"
    system cmd
    puts
  end    

end

client = Client.new
#loop do 
  client.run 
  sleep 1
#end
